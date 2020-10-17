package xml;

/**
 *  I have imported the full javax.xml.bind.annotation.* library because when
 *  trying to add individual libraries, I get an error that I could not fix.
 *  For some reason, my IDE only wants it in this form.
 */

import javax.persistence.*;
import javax.xml.bind.annotation.*;

/**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="symbol" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="price" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="time" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "value"
    })
    @Entity
    @Table(name = "Stocks")
    public class Stock implements XMLDomainObject {

        @XmlValue
        protected int value;
        @XmlAttribute(name = "symbol")
        protected String symbol;
        @XmlAttribute(name = "price")
        protected String price;
        @XmlAttribute(name = "time")
        protected String time;


         /**
         * Gets the value of the value property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
         @Id
         @Column(name = "ID", nullable = false, insertable = true, updatable = true)
         public int getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Gets the value of the symbol property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @Basic
        @Column (name = "symbol", nullable = false, insertable = true, updatable = true, length = 256)
        public String getSymbol() {
            return symbol;
        }

        /**
         * Sets the value of the symbol property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSymbol(String value) {
            this.symbol = value;
        }

        /**
         * Gets the value of the price property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @Basic
        @Column (name = "price", nullable = false, insertable = true, updatable = true, length = 256)
        public String getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPrice(String value) {
            this.price = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @Basic
        @Column(name = "time", nullable = false, insertable = true, updatable = true)
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTime(String value) {
            this.time = value;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (value != stock.value) return false;
        if (time != null ? !time.equals(stock.time) : stock.time != null)
            return false;
        if (symbol != null ? !symbol.equals(stock.symbol) : stock.symbol != null)
            return false;
        if (price != null ? !price.equals(stock.price) : stock.price != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (symbol != null ? symbol.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

        @Override
        public String toString() {
            return "Stock{" +
                    "value= '" + value + '\'' +
                    "symbol='" + symbol + '\'' +
                    ", price='" + price + '\'' +
                    ", time='" + time + '\'' +
                    '}';
        }
    }



