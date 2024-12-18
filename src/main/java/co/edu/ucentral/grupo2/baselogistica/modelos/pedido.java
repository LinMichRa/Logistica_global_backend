package co.edu.ucentral.grupo2.baselogistica.modelos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "pedidos")
@Builder

public class pedido{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="direccion")
    private String direccion;

    @Column(name="localidad")
    private String localidad;

    @Column(name="cd_postal") //codigo postal
    private int cd_postal;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="ct_paquetes") //cantidad paquetes
    private int ct_paquetes;

    @Column(name="estado")
    private String estado;

    @Column(name="fechaBodega")
    private Date fechaBodega;

    @Column(name="fechaTransito")
    private Date fechaTransito;

    @Column(name="fechaEntregado")
    private Date fechaEntregado;

    @Column(name="foto")
    private String foto;

    @Column(name="novedad")
    private String novedad;

    @Column(name="origen")
    private String origen;

    @Column(name="destino")
    private String destino;
    @ManyToOne
    @JoinColumn(name="cliente_cedula")
    private cliente cliente;

    @ManyToOne
    @JoinColumn(name="despachador_cedula")
    @JsonIgnore
    private despachador admin;

    @ManyToOne
    @JoinColumn(name="conductor_cedula")
    private conductor conductor;
}