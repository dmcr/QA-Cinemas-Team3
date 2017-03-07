
function filmPoster(title) {
    <!--{{film.title}} -->
    var $Poster = $('#poster');
    var sUrl, oData;
    sUrl = 'https://www.omdbapi.com/?t=' + title + '&type=movie&tomatoes=true';
    $.ajax(sUrl, {
        complete: function (p_oXHR) {
            oData = $.parseJSON(p_oXHR.responseText);
            $Poster.find('.poster').html('<img class="image" src="' + oData.Poster + '"/>');
            $Poster.show();
        }
    });
}

