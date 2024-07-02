package maelton.compass.humanizeit.enums;

public enum RioGrandeDoSulDonationCenters {
    ESPERANCA(
            "Centro de Distribuição Esperança",
            "Av. Boqueirão, 2450 - Igara, Canoas - RS, 92032-420"
    ),
    PROSPERIDADE(
            "Centro de Distribuição Prosperidade",
            "Av.Borges de Medeiros, 1501 – Cidade Baixa, Porto Alegre - RS, 90119-900"
    ),
    RECONSTRUCAO(
            "Centro de Distribuição Reconstrução",
            "R. Dr. Décio Martins Costa, 312 - Vila Eunice Nova, Cachoeirinha - RS, 94920-170"
    );

    final String name;
    final String address;

    RioGrandeDoSulDonationCenters(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}