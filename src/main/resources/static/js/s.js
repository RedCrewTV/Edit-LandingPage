document.addEventListener('input', function(event) {
      if (event.target.classList.contains('editable')) {
          event.target.style.fontWeight = 'bold';
      }
  });
  