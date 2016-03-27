/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mastercode;

/**
 *
 * @author muhammaddyasyaskur
 */

class Car {
private int maxspeed = 300;
    int getMaxSpeed() {
return maxspeed;
    }

    void changeEngine(Engine turbopropEngine) {
        maxspeed = turbopropEngine.getMaxSpeed();
    }

    
}
