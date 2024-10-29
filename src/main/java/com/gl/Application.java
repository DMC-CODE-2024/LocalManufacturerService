/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gl;

import com.gl.Config.MySQLConnection;
import com.gl.P5Process.LocalManufacturerProcess;


public class Application {
    public static void main(String[] args) {
        LocalManufacturerProcess.p5(new MySQLConnection().getConnection());
        System.exit(0);
    }
}



// insert into sys_param (tag ,value ) values
// ( 'trc_localmfg_imei_update_last_run_time' , '2020-01-01');
