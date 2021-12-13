package com.company;

public class Storage {
    private Location[] locs = new Location[3];

    public Storage() {
        locs[0] = new Location(0, "You are on start. What to do?",
                new Action[]{ new Action("Forward", 1),
                        new Action("Backward", 2)
                });
        locs[1] = new Location(1, "You are in the forest. What to do?",
                new Action[]{ new Action("Forward", 2),
                        new Action("Backward", 0)
                });

        locs[2] = new Location(2, "You are on the forest. What to do?",
                new Action[]{ new Action("Left", 1),
                        new Action("Right", 0)
                });
    }
    Location getLocation(int id){
        return locs[id];
    }
}