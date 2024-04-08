let currentIndex = 0;

let slides = document.querySelectorAll(".heroContainer");

const showSlide = (index) => {
  slides.forEach((slide, i) => {
    slide.style.opacity = i === index ? 1 : 0;
  });
};

const nextSlide = () => {
  let totalslides = slides.length;

  currentIndex = (currentIndex + 1) % totalslides;

  showSlide(currentIndex);
};

const prevSlide = () => {
  let totalslides = slides.length;

  currentIndex = (currentIndex - 1) % totalslides;

  showSlide(currentIndex);
};

setInterval(() => {
  nextSlide();
}, 4000);

showSlide(currentIndex);
