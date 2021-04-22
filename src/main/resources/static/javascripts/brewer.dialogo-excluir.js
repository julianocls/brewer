Brewer = Brewer || {};


Brewer.DialogoExcluir = (function() {

   function DialogoExcluir() {
      this.btnExclusaoBtn = $('.js-exclusao-btn');
   }

   DialogoExcluir.prototype.iniciar = function() {
      this.btnExclusaoBtn.on('click', onExcluirClicado.bind(this));	

      if(window.location.search.indexOf('excluido') > -1) {
	     swal('Pronto!', 'Excluído com sucesso!', 'success');
      }
   }

   function onExcluirClicado(evento) {
      evento.preventDefault();
      var botaoClicado = $(evento.currentTarget);
      var url = botaoClicado.data('url');
      var objeto = botaoClicado.data('objeto');

      swal({
	      title: 'Tem certeza?',
          text: 'Excluir "' + objeto + '"? Você não poderá recuperá-lo depois.',
          showCancelButton: true,
          confirmButtonColor: '#DD6B55',
          confirmButtonText: 'Sim, excluir agora',
          closeOnConfirm: false
      }, onExcluirConfirmado.bind(this, url));
   }

   function onExcluirConfirmado(url) {
      $.ajax({
	     url: url,
         method: 'DELETE',
         success: onExcluidoSucesso.bind(this),
         error: onErroExcluir.bind(this)
      });
   }

   function onErroExcluir(e) {
      swal('Oops!', e.responseText, 'error');
   }

   function onExcluidoSucesso() {
      var urlAtual = window.location.href;
      var separador = urlAtual.indexOf('?') > -1 ? '&' : '?';
      var novaUrl = urlAtual.indexOf('excluido') > -1 ? urlAtual : urlAtual + separador + 'excluido';

      window.location = novaUrl;
   }


   return DialogoExcluir;
	
}());

$(function(){
	var dialogo = new Brewer.DialogoExcluir();
	dialogo.iniciar();
});