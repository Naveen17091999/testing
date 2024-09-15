// script.js
// document.getElementById('completeForm').addEventListener('submit', function(event) {
//     event.preventDefault(); // Prevent the form from submitting traditionally

//     console.log("edfwqe");
    
//     // const formData = new FormData(this);
//     // const result = [];

//     // formData.forEach((value, key) => {
//     //     result.push(`${key}: ${value}`);
//     // });

//     // const resultText = result.join('\n');
//     // document.getElementById('result').textContent = `Form Submitted Successfully!\n\n${resultText}`;
// });

document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('completeForm');

    form.addEventListener('submit', (event) => {
        event.preventDefault();
        // Your form handling logic here
        console.log('Form submitted without reloading the page.');
    });
});

// function submitForm(event){
//     event.preventDefault(); 
// console.log("scasdf");

//     // const formData = new FormData(this);
//     // const result = [];

//     // formData.forEach((value, key) => {
//     //     result.push(`${key}: ${value}`);
//     // });

//     // const resultText = result.join('\n');
//     // document.getElementById('result').textContent = `Form Submitted Successfully!\n\n${resultText}`;

// }