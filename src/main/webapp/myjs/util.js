/**
 * Created by ASUS on 2017/3/30.
 */

// $(function($) {
//     put_content_in_editor()
// })

function set_content_in_editor(content) {
    var e = $("#div1").html(content);
}

function get_blog_json(id) {
    alert("ddddd");
    $.ajax({
            type: "POST",
            url: "blog/"+id+"/getBlogJson.do",
            success: function (data) {
                var jobj = JSON.parse(data);
                var div1 = document.getElementById("div1");
                div1.innerHTML = jobj.content;
            }
        }
    )

}