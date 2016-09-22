package modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author IGOR
 */
@Entity
@Table(name="Medidas")
public class Medidas implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int identificador;
    private int numUnico;
    private int codProd;
    private int quantidade;
    private float comprimento;
    
    public Medidas(){
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getNumUnico() {
        return numUnico;
    }

    public void setNumUnico(int numUnico) {
        this.numUnico = numUnico;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
}
