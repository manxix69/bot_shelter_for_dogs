package pro.sky.telegrambot.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickName;
    private Integer year;
    private LocalDateTime workingFirstTime;
    private LocalDateTime workingLastTime;

    public Volunteer(Long id, String name, String nickName, Integer year, LocalDateTime workingFirstTime,
                     LocalDateTime workingLastTime) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.year = year;
        this.workingFirstTime = workingFirstTime;
        this.workingLastTime = workingLastTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return Objects.equals(id, volunteer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String toString() {
        return "id волонтёра: " + this.id + "; Имя волонёра: " + this.name + "; Никнейм волонтёра в телеграме: "
                + this.nickName + "; Время работы волонтёра: С "
                + this.workingFirstTime + " до " + this.workingLastTime;
    }
}