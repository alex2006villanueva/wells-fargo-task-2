package com.wellsfargo.counselor.entity;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column
    private String portfolioName;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(Client client,
                     String portfolioName,
                     LocalDateTime createdAt,
                     LocalDateTime updatedAt,
                     List<Security> securities) {

        this.client = client;
        this.portfolioName = portfolioName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.securities = securities;
    }
    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    // repeat for:
    createdAt
            updatedAt
    securities
}
