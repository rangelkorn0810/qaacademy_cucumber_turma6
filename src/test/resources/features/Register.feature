#language:pt
  @register
  Funcionalidade: Como usuário do site Register
  Eu desejo realizar um cadastro
  Para validar se foi cadastrado com sucesso

    @test001
  Cenario: Validar cadastro com sucesso no site Register
  Dado que eu acesso o site Register
  E preencho o campo nome com o valor "Rangel"
    E preencho o campo sobre nome com o valor "Souza"
    E preencho o campo endereço com o valor "Rua Serra da Mantiqueira, 200"
    E preencho o campo e-mail com o valor "rangelsouza1987@yahoo.com.br"
    E preencho o campo telefone com o valor "11985729050"
    E clico no radio bottom Male
    E clico no check box o valor Movies
    E seleciono no campo skills o valor "Java"
    E seleciono no campo Select Country o valor Japan
    E seleciono no campo year o valor "1987"
    E seleciono no campo month o valor "October"
    E seleciono no campo day o valor "8"

