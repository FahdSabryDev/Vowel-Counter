document.getElementById('countBtn').addEventListener('click', function() {
    const text = document.getElementById('inputText').value;
    const count = text.match(/[aeiouAEIOU]/g)?.length || 0;
    document.getElementById('result').textContent = `Number of vowels: ${count}`;
});
