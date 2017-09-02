package Model;

/**
 * Created by Abhiprae on 7/21/2017.
 */

public class Session {

    static User user;
    static Stock stocks[];
    static User leaderboard[];
    static Stock bought[];

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Session.user = user;
    }

    public static Stock[] getStocks() {
        return stocks;
    }

    public static void setStocks(Stock stocks[]) {
        Session.stocks = stocks;
    }

    public static User[] getLeaderboard() {
        return leaderboard;
    }

    public static void setLeaderboard(User[] leaderboard) {
        Session.leaderboard = leaderboard;
    }

    public static Stock[] getBought() {
        return bought;
    }

    public static void setBought(Stock[] bought) {
        Session.bought = bought;
    }
}
