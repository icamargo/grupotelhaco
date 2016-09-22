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
@Table (name = "Pedido")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int identificador;
    private int numUnico;
    private String cpfCpnj;
    private String nomeParceiro;
    private int codProduto;
    private String descProduto;
    private int quantidade;
    private float valorTotal;
    private char status;
    private int chave;
    
    public Pedido(){
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

    public String getCpfCpnj() {
        return cpfCpnj;
    }

    public void setCpfCpnj(String cpfCpnj) {
        this.cpfCpnj = cpfCpnj;
    }

    public String getNomeParceiro() {
        return nomeParceiro;
    }

    public void setNomeParceiro(String nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
}
