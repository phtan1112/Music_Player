module com.musicplayer.musicplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.sql;


    opens com.musicplayer.musicplayer to javafx.fxml;
    exports com.musicplayer.musicplayer;
}