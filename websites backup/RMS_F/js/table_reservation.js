 $(document).ready(function () {
                            $("#dater").datepicker({minDate: 0, dateFormat: "yy-mm-dd"}).change(function () {
                                $("#sh").html("");
                                var selDate = $(this).val();
                                var START_HOUR = 6;
                                var END_HOUR = 20;
                                var START_MINUTE = 0;
                                if (parseInt(selDate.split("-")[2]) === new Date().getDate()) {
                                    START_HOUR = parseInt(new Date().getHours()) + 2;
                                    START_MINUTE = parseInt(new Date().getMinutes());
                                } else {
                                    START_HOUR = 6;
                                    START_MINUTE = 0;
                                }
                                for (i = START_HOUR; i <= END_HOUR; i++) {
                                    var h = i % 12;
                                    h = (h === 0) ? 12 : h;
                                    h = (("" + h).length === 1) ? "0" + h : h;
                                    var par = "";
                                    par = (i >= 12) ? " PM" : " AM";
                                    $("#sh").append("<option value=\"" + i + "\">" + h + par + "</option>");
                                }
                                $("#sm").html("");
                                for (h = START_MINUTE; h < 60; h++) {


                                    h = (("" + h).length === 1) ? "0" + h : h;

                                    $("#sm").append("<option value=\"" + h + "\">" + h + "</option>");
                                }

                                $("#sh").change(function () {
                                    $("#eh").html("");

                                    for (i = parseInt($(this).val()) + 1; i <= parseInt($(this).val()) + 2; i++) {
                                        var h = i % 12;
                                        h = (h === 0) ? 12 : h;
                                        h = (("" + h).length === 1) ? "0" + h : h;
                                        var par = "";
                                        par = (i >= 12) ? " PM" : " AM";
                                        $("#eh").append("<option value=\"" + i + "\">" + h + par + "</option>");
                                        $("#eh").attr("disabled", false);

                                    }

                                });
                                $("#eh").change(function () {
                                    $("#em").html("");

                                    var END_M = 60;
                                    if (parseInt($(this).val()) === parseInt($("#sh").val()) + 2) {

                                        END_M = parseInt($("#sm").val());

                                    }
                                    if (END_M != 0) {
                                        for (h = 0; h < END_M; h++) {

                                            h = (("" + h).length === 1) ? "0" + h : h;

                                            $("#em").append("<option value=\"" + h + "\">" + h + "</option>");
                                        }
                                    } else {
                                        $("#em").append("<option value=\"00\">00</option>");

                                    }
                                });


                            });
                            $(":radio").change(function () {
                                $("#stab").val($(this).val());
                                $("#tbn").text($(this).val());
                                ;
                            });

                        });
                        function checkit() {
                            if ($("#f1").val().length >= 1 && $("#f2").val().length >= 10) {
                                return true;
                            } else {
                                alert("suply the data correctly");
                                return false;
                            }
                        }
                        function valid() {
                            return ($("#dater").val().length === 10 && $("#sh").val() !== null && $("#eh").val() !== null && $("#sm").val() !== null && $("#em").val() !== null);
                        }