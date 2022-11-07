public class Batalha {

    public Ninja lutar(Ninja ninjaUm, Ninja ninjaDois){

        for(int i = 0; i < 3; i++){
            ninjaUm.atacar(ninjaDois);
            ninjaDois.atacar(ninjaUm);
        }

        if(ninjaUm.getNome().equals("Itachi")){

            return ninjaUm;

        } else if(ninjaDois.getNome().equals("Itachi")){

            return ninjaDois;

        } else if(ninjaUm.getChackra() > ninjaDois.getChackra()){

            return ninjaUm;

        } else if(ninjaDois.getChackra() > ninjaUm.getChackra()){

            return ninjaDois;

        }

        return ninjaUm;
    }
}
