package com.pythondrops.testing;

import java.sql.SQLException;
import java.util.UUID;

public class Application {
    public static void main (String [] args) throws SQLException, UserNotAllowedException, ChannelNotAvailableException {
        DemoCode dc = new DemoCode(new DatabaseWrapper());
        dc.postMessageToChannel(UUID.fromString("162b27bf-4c0b-11ee-a0e1-0242ac110002"), UUID.fromString("347047f3-4bf4-11ee-a0e1-0242ac110002"), "Title", "Content");
    }
}
