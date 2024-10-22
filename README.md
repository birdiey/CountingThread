<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CountingThread Project</title>
</head>
<body>

<h1>CountingThread Project</h1>

<p>This Java project demonstrates the use of multithreading to increment the age of a <code>Person</code> object using multiple threads. Each thread increments the person's age five times and prints the result.</p>

<h2>Project Structure</h2>

<ul>
    <li><strong>CountingThread.java</strong>: The main class that initializes the <code>Person</code> and two threads to run the <code>PersonThread</code>.</li>
    <li><strong>Person.java</strong>: A class that represents a person with an age attribute and methods to increment and retrieve the age.</li>
    <li><strong>PersonThread.java</strong>: A class that implements <code>Runnable</code> to execute the age incrementing logic in a separate thread.</li>
</ul>

<h2>Classes and Files</h2>

<h3><code>CountingThread</code> class</h3>
<p>This is the main entry point of the application. It creates two threads (Samu and Samkelo) that run concurrently and increment the age of a shared <code>Person</code> object.</p>

<h3><code>Person</code> class</h3>
<ul>
    <li><strong>Attributes</strong>: The <code>Person</code> class has an <code>age</code> attribute that starts at 0.</li>
    <li><strong>Methods</strong>:
        <ul>
            <li><code>getAge()</code>: Returns the current age of the person.</li>
            <li><code>setAge(int age)</code>: Sets the age of the person.</li>
            <li><code>incrementAge()</code>: Increments the person's age by 1.</li>
        </ul>
    </li>
</ul>

<h3><code>PersonThread</code> class</h3>
<p>This class implements the <code>Runnable</code> interface. In the <code>run()</code> method, it increments the <code>Person</code>'s age and prints the thread's name and the current age five times.</p>

<h2>How to Run the Project</h2>
<ol>
    <li>Clone the repository to your local machine.</li>
    <li>Open the project in your preferred IDE (e.g., NetBeans, IntelliJ IDEA).</li>
    <li>Build the project and run the <code>CountingThread</code> main class.</li>
</ol>

<h2>Expected Output</h2>
<p>The two threads will start and increment the person's age. Since both threads share the same <code>Person</code> object, you will see concurrent access to the person's age, resulting in interleaved output, as shown below:</p>

<pre>
Samu is starting
Samu: 1
Samkelo is starting
Samkelo: 2
Samu: 3
Samkelo: 4
Samu: 5
Samkelo: 6
Samu: 7
Samkelo: 8
Samu: 9
Samkelo: 10
Samu is stopping
Samkelo is stopping
</pre>

<h2>Note</h2>
<p>Since multiple threads are accessing and modifying the same <code>Person</code> object, the output may vary each time the program is run. To avoid data inconsistency, you might want to use synchronization techniques.</p>

<h2>Contributing</h2>
<p>Feel free to fork the repository, submit issues, or send pull requests. Contributions to improve the project are always welcome.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License.</p>

</body>
</html>
