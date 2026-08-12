

void main(){
  IO.println("Seja bem-vindo ao SpaceCine, Venha fazer parte dos melhores cinemas do Brasil!");



  Filme filme = new Filme();
  filme.setNome("CyberPunk 2077");
  IO.println(filme.getNome());

  filme.setDuracao(200);

  filme.setDtEstreia(LocalDate.of(2026, 8, 12));
  IO.println(filme.getDtEstreia());





}