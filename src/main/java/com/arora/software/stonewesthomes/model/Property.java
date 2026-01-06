package com.arora.software.stonewesthomes.model;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsContructor
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition  = "Text")
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PropertyType type;

    


}
