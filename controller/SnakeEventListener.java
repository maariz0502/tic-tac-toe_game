package controller;

import model.SnakeNode;
import model.observerPattern.SnakeObserver;

public class SnakeEventListener implements SnakeObserver{

    @Override
    public void hitFood() {
        App.model.score += 10;
        App.model.snake.nodes.add(new SnakeNode(-100, -100));
        App.model.getStrategy().play();
    }

    @Override
    public void hitWall() {
        App.model.messages = "Hit the wall - Press <Restart>";
        App.win.goNextState();
    }

    @Override
    public void hitSelf() {
        App.model.messages = "Hit self body - Press <Restart>";
        App.win.goNextState();
    }

    @Override
    public void hitSnake() {
        App.model.messages = "Hit snake - Press <Restart>:";
        App.win.goNextState();
    }

    @Override
    public void hitObstacle() {
        App.model.messages = "Hit obstacle - Press <Restart>:";
        App.win.goNextState();
    }

}
