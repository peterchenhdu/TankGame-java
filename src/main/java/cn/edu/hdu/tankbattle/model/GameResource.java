/*
 * Copyright (c) 2011-2025 PiChen.
 */

package cn.edu.hdu.tankbattle.model;

import java.util.Vector;

import cn.edu.hdu.tankbattle.model.map.Map;
import org.springframework.stereotype.Component;

/**
 * GameResource...
 *
 * @author chenpi
 * @since 2011-02-10 19:29
 */
@Component
public class GameResource {
    /**
     * 我的坦克容量
     */
    private Vector<MyTank> myTanks = new Vector<MyTank>();
    /**
     * 敌人坦克容量
     */
    private Vector<EnemyTank> enemys = new Vector<EnemyTank>();
    ; // 敌人坦克组
    /**
     * 炸弹容量
     */
    private Vector<Bomb> bombs = new Vector<Bomb>();
    ; // 炸弹集合

    /**
     * 坦克游戏地图对象
     */
    private Map map;

    /**
     * reset TODO @Title: reset @Description: TODO @param @return void @throws
     */
    public void reset() {
        myTanks.clear();
        enemys.clear();
        bombs.clear();
        map = null;
    }

    public Vector<MyTank> getMyTanks() {
        return myTanks;
    }

    public void setMyTanks(Vector<MyTank> myTanks) {
        this.myTanks = myTanks;
    }

    public Vector<EnemyTank> getEnemys() {
        return enemys;
    }

    public void setEnemys(Vector<EnemyTank> enemys) {
        this.enemys = enemys;
    }

    public Vector<Bomb> getBombs() {
        return bombs;
    }

    public void setBombs(Vector<Bomb> bombs) {
        this.bombs = bombs;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}