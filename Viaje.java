/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1gbd10
 */
public class Viaje {
    private int id;
    private double hIda;
    private double mIda;
    private double hVuelta;
    private double mVuelta;
    private String vehiculo;

    public Viaje() {
    }

    public Viaje(int id, double hIda, double mIda, double hVuelta, double mVuelta, String vehiculo) {
        this.id = id;
        this.hIda = hIda;
        this.mIda = mIda;
        this.hVuelta = hVuelta;
        this.mVuelta = mVuelta;
        this.vehiculo = vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double gethIda() {
        return hIda;
    }

    public void sethIda(double hIda) {
        this.hIda = hIda;
    }

    public double getmIda() {
        return mIda;
    }

    public void setmIda(double mIda) {
        this.mIda = mIda;
    }

    public double gethVuelta() {
        return hVuelta;
    }

    public void sethVuelta(double hVuelta) {
        this.hVuelta = hVuelta;
    }

    public double getmVuelta() {
        return mVuelta;
    }

    public void setmVuelta(double mVuelta) {
        this.mVuelta = mVuelta;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
