package maelton.compass.humanizeit.model.enums;

import lombok.Getter;

import java.util.Optional;

public enum DonationCenter {
    HUMANIZEIT(
            "HumanizeIt Donation Center",
            "",
            null
    ),
    ESPERANCA(
            "Centro de Distribuição Esperança",
            "Av. Boqueirão, 2450 - Igara, Canoas - RS, 92032-420",
            1000
    ),
    PROSPERIDADE(
            "Centro de Distribuição Prosperidade",
            "Av.Borges de Medeiros, 1501 – Cidade Baixa, Porto Alegre - RS, 90119-900",
            1000
    ),
    RECONSTRUCAO(
            "Centro de Distribuição Reconstrução",
            "R. Dr. Décio Martins Costa, 312 - Vila Eunice Nova, Cachoeirinha - RS, 94920-170",
            1000
    );

    @Getter
    final String name;
    @Getter
    final String address;
    @Getter
    final Optional<Integer> maxCapacity;

    DonationCenter() {
        this.name = null;
        this.address = null;
        this.maxCapacity = Optional.empty();
    }

    DonationCenter(String name, String address, Integer maxCapacity) {
        this.name = name;
        this.address = address;
        this.maxCapacity = Optional.ofNullable(maxCapacity);
    }
}