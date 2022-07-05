package test.umpramuitos;

import infra.DAO;
import model.umpramuitos.ItemPedido;
import model.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorId(1L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

    }
}
