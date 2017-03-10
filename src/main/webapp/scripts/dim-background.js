/**
 * Created by Administrator on 08/03/2017.
 */
$(function () {
    $('.actionBox')
        .mouseenter(function () {
            $(this).dimBackground({
                darkness: 0.7  // 0: no dimming, 1: completely black
            });
        })
        .mouseleave(function () {
            $(this).undim();
        });
});