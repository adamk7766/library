package pl.akademiakodu.library.model;

//import com.example.tasksAndNotes.model.Note;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

/*    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Note> notes = new ArrayList<>();

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }



    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }*/

    @PreRemove
    private void preRemove() {
        System.out.println("Usunięto autora");
    }

/*    public int getNumberOfNotes(){
        return notes.size();
    }

    public int getNumberOfTasks(){
        return tasks.size();
    }*/

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName()+" "+getSurname();
    }
}
