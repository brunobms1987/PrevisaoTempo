/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bruno Martins
 */
public class CidadeApi {
    private Integer id;
    private PaisApi paisApi = new PaisApi();
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PaisApi getPaisApi() {
        return paisApi;
    }

    public void setPaisApi(PaisApi paisApi) {
        this.paisApi = paisApi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
