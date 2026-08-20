const container = document.getElementById("ingressos");

async function carregarIngressos() {

    try {

        const resposta = await fetch("/api/ingressos");

        if (!resposta.ok) {
            throw new Error("Erro ao buscar ingressos");
        }

        const ingressos = await resposta.json();

        container.innerHTML = "";

        ingressos.forEach(ingresso => {

            const card = document.createElement("div");

            card.classList.add("card");

            card.innerHTML = `
                <h3>${ingresso.festa.nome}</h3>

                <p><strong>Setor:</strong> ${ingresso.setor}</p>

                <p><strong>Local:</strong> ${ingresso.festa.endereco}</p>

                <p><strong>Horário:</strong> ${ingresso.festa.horario}</p>

                <p class="preco">
                    R$ ${Number(ingresso.preco).toFixed(2)}
                </p>

                <button onclick="comprar(${ingresso.id})">
                    Comprar ingresso
                </button>
            `;

            container.appendChild(card);
        });

    } catch (erro) {

        console.error(erro);

        container.innerHTML = `
            <p>Não foi possível carregar os ingressos.</p>
        `;
    }
}

function comprar(id) {

    alert(`Ingresso ${id} selecionado!`);
}

carregarIngressos();