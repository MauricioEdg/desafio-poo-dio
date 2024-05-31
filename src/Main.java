import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(7);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMau = new Dev();
        devMau.setNome("mauricio");
        devMau.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos mau: "+ devMau.getConteudosInscritos());
        devMau.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos mau: "+ devMau.getConteudosInscritos());
        System.out.println("conteudos concluidos mau: "+ devMau.getConteudosConcluidos());
        System.out.println("XP:" + devMau.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devJoao = new Dev();
        devMau.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos joao: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos joao: "+ devJoao.getConteudosInscritos());
        System.out.println("conteudos concluidos joao: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}