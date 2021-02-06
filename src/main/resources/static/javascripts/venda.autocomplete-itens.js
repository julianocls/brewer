Brewer = Brewer || {}

Brewer.Autocomplete = (function() {

	function Autocomplete() {
		this.skuOuNomeInput = $('.js-sku-nome-cerveja-input');

	}

	Autocomplete.prototype.iniciar = function() {
		options = {
			url: function(skuOuNome) {
				return '/brewer/cervejas/filtro?skuOuNome=' + skuOuNome;
			},
			getValue: 'nome',
			minCharNumber: 3,
			ajaxSettings: {
				contentType: "application/json"
			}
		};

		this.skuOuNomeInput.easyAutocomplete(options);
	}

	return Autocomplete;


}());

$(function() {

	var autocomplete = new Brewer.Autocomplete();
	autocomplete.iniciar();

})