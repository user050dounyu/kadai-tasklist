package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllTasks",//↓のSELECT文の名前
                    query = "SELECT t FROM Task AS t ORDER BY t.id DESC"//SELECT tはSELECT *と同じ
            ),
    @NamedQuery(
            name = "getTasksCount",
            query = "SELECT COUNT(t) FROM Task AS t"
            )
})

@Table(name = "tasks")
public class Task{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主キー自動生成、（生成をDBに委任）
    private Integer id;

    //作成日時
    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    //更新日時
    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    //内容
    @Column(name = "content",length = 255, nullable = false)
    private String  content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
