package com.wellsfargo.counselor.entity;

@Entity
public class Securities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private LocalDate purchaseDate;

    @Column
    private BigDecimal purchasePrice;

    @Column
    private Integer quantity;

    public Security() {}

    public Security(Portfolio portfolio,
                    String name,
                    String category,
                    LocalDate purchaseDate,
                    BigDecimal purchasePrice,
                    Integer quantity) {

        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }
    public Long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // repeat for:
    category
            purchaseDate
    purchasePrice
            quantity
}
