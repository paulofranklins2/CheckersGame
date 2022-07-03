package com.example.checkersgame;

import javafx.application.Application;
import javafx.stage.Stage;

public class CheckersApp extends Application {
    public static final int TILE_SIZE = 100;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private Tile [][] board = new Tile[WIDTH][HEIGHT];

    @Override
    public void start(Stage stage) throws Exception {

    }
}
