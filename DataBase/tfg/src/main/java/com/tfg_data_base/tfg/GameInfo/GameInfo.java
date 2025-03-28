package com.tfg_data_base.tfg.GameInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "GameInfo")
@Data
public class GameInfo {
    // El id sera unico ya que solo exitira un json con la informacion
    private String id = "GAME_INFO_ID";
    private List<Critteron> critterons = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<Mark> marks = new ArrayList<>();
    private WeekRewards weekRewards;
    private Integer cureTime;

    @Data
    public static class Critteron {
        private String critteronID;
    }

    @Data
    public static class Room {
        private String roomID;
    }

    @Data
    public static class Mark {
        private String markID;
    }

    @Data
    public static class WeekRewards {
        private Map<String, DayReward> days;

        @Data
        public static class DayReward {
            private Integer reward1;
            private Integer reward2;

            public DayReward(Integer reward1, Integer reward2) {
                this.reward1 = reward1;
                this.reward2 = reward2;
            }
        }
    }
}
