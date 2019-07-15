/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class Previsao {

    List<ForCast> list;

    public Previsao() {
        this.list = new ArrayList<>();
    }
    
    public List<ForCast> getList() {
        return list;
    }

    public void setList(List<ForCast> list) {
        this.list = list;
    }

}
