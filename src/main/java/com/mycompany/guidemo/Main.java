/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guidemo;

/**
 *
 * @author bgabr
 */
public class Main {
    public static void main(String[] args)
    {
        JFrameLogin login = new JFrameLogin();
        JFrameLogin.S.setVisible(true);
        JFrameRegister register = new JFrameRegister();
        JFrameSearch search = new JFrameSearch();
    }
}
