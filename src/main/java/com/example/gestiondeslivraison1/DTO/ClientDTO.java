package com.example.gestiondeslivraison1.DTO;

public class ClientDTO {
   private long id_clientDTO;
    private String nomDTO ;
    private String prenomDTO;
    private String localisationDTO;
    private long tel_clientDTO;


    public long getId_clientDTO() {
        return id_clientDTO;
    }

    public void setId_clientDTO(long id_clientDTO) {
        this.id_clientDTO = id_clientDTO;
    }

    public String getNomDTO() {
        return nomDTO;
    }

    public void setNomDTO(String nomDTO) {
        this.nomDTO = nomDTO;
    }

    public String getPrenomDTO() {
        return prenomDTO;
    }

    public void setPrenomDTO(String prenomDTO) {
        this.prenomDTO = prenomDTO;
    }

    public String getLocalisationDTO() {
        return localisationDTO;
    }

    public void setLocalisationDTO(String localisationDTO) {
        this.localisationDTO = localisationDTO;
    }

    public long getTel_clientDTO() {
        return tel_clientDTO;
    }

    public void setTel_clientDTO(long tel_clientDTO) {
        this.tel_clientDTO = tel_clientDTO;
    }
}
