package org.example.model;

public class Player {
    private String name;
    private String mlId;
    private String highestRank;

    public Player(String name, String mlId, String highestRank) {
        this.name = name;
        this.mlId = mlId;
        this.highestRank = highestRank;
    }

    public String getName() {
        return name;
    }

    public String getMlId() {
        return mlId;
    }

    public String getHighestRank() {
        return highestRank;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ML ID: " + mlId + ", Rank: " + highestRank;
    }
}
