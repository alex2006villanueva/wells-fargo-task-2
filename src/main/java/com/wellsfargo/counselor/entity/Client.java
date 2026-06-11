package com.wellsfargo.counselor.entity;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private Long clientID

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @Column
    private Boolean isActive;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {
    }

    public Client(FinancialAdvisor advisor,
                  String firstName,
                  String lastName,
                  String email,
                  String phone,
                  LocalDate dateOfBirth,
                  LocalDateTime createdAt,
                  LocalDateTime updatedAt,
                  Boolean isActive,
                  List<Portfolio> portfolios) {

        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
        this.portfolios = portfolios;
    }
    public Long getClientId() {
        return clientId;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // repeat for:
    lastName
            email
    phone
            dateOfBirth
    createdAt
            updatedAt
    isActive
            portfolios
}

