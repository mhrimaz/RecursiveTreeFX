/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivecalltreefx;

/**
 *
 * @author hossein
 */
public class Point {

    double x;
    double y;

    public Point getDestination(float distance, double angle, int level) {
        Point p = new Point();
        p.x = x + (Math.cos(Math.toRadians(angle)) * level * distance);
        p.y = y - (Math.sin(Math.toRadians(angle)) * level * distance);
        return p;
    }
}
