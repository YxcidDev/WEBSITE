(function () {
  emailjs.init("RP0BL_f0dQkX1XhmJ");
})();

document
  .getElementById("contact-form")
  .addEventListener("submit", function (event) {
    event.preventDefault();

    emailjs.sendForm("service_viucnnz", "template_1az2l1c", this).then(
      function () {
        alert("¡Mensaje enviado con éxito!");
        document.getElementById("contact-form").reset();
      },
      function (error) {
        alert("Error al enviar: " + JSON.stringify(error));
      }
    );
  });
