package com.dio.base;


import java.math.BigDecimal;

/**
 * @author Hejociara do Vale
 * @version 1.0.0
 * @see java.math.BigDecimal
 * @since Release 1.0.0
 */

public class Order {
    // representa o código do pedido:
    private final String code;
    private final BigDecimal totalValue;

    /**
     * construtor de classe
     * @param code código do pedido
     * @param totalValue valor total do pedido
     */

    public Order (String code, String totalValue) {
        this.code = code;
        this.totalValue = BigDecimal.valueOf(Double.parseDouble(totalValue));

    }

    /**
     * calcula o valor total de acordo com o valor do pedido. Se o valor for maior do que 100 reais uma taxa será cobrada
     * @return valor total do pedido com taxas
     * @throws RuntimeException se o pedido for um valor negativo
     */
    public BigDecimal calculateFee() throws RuntimeException{
        if (this.totalValue.signum() < 0){
            throw new RuntimeException("O pedido pode ter valor negativo");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;

      }
}
