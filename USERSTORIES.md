# Todo List User Stories


```
As a user,
So I can update my To Do list, 
I want to add tasks to my to do list
```
| Classes    | Methods                | Scenario                                     | Outputs |
|------------|------------------------|----------------------------------------------|---------|
| `ToDoList` | `add(String taskName)` | If taskname was added                        | true    |
|            |                        | If taskname was not added, or already exists | false   |

```
As a user,
So I can get an overview of my current tasks, 
I want to see all the tasks in my todo list.
```
| Classes    | Methods  | Scenario                       | Outputs      |
|------------|----------|--------------------------------|--------------|
| `ToDoList` | `view()` | If there are tasks in the list | List<String> |
|            |          | If there are no tasks          | null         |

```
As a user,
So I can see what tasks I have finished or not, 
I want to change the status of a task between incomplete and complete.
```
| Classes    | Methods                         | Scenario                     | Outputs |
|------------|---------------------------------|------------------------------|---------|
| `ToDoList` | `changeStatus(String taskName)` | If the task could be changed | true    |
|            |                                 | If the task does not exist   | false   |
```
As a user,
So I can see what tasks I have completed, 
I want to be able to get only the complete tasks.
```
| Classes    | Methods                | Scenario                       | Outputs      |
|------------|------------------------|--------------------------------|--------------|
| `ToDoList` | `viewCompletedTasks()` | If there are tasks in the list | List<String> |
|            |                        | If there are no tasks          | null         |


```
As a user,
So I can see what tasks I have left, 
I want to be able to get only the incomplete tasks.
```
| Classes    | Methods                 | Scenario                       | Outputs      |
|------------|-------------------------|--------------------------------|--------------|
| `ToDoList` | `viewIncompleteTasks()` | If there are tasks in the list | List<String> |
|            |                         | If there are no tasks          | null         |



```
As a user,
So I can keep my list updated, 
I want to remove tasks from my list.
```
| Classes    | Methods                       | Scenario                       | Outputs      |
|------------|-------------------------------|--------------------------------|--------------|
| `ToDoList` | `removeTask(String taskName)` | If there are tasks in the list | List<String> |
|            |                               | If there are no tasks          | null         |


```
As a user,
So I can search for a task, 
I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
```
| Classes    | Methods                       | Scenario                  | Outputs |
|------------|-------------------------------|---------------------------|---------|
| `ToDoList` | `searchTask(String taskName)` | If the task was found     | String  |
|            |                               | If the task was not found | String  |


```
As a user,
So I can organize my tasks, 
I want to see all the tasks in my list ordered alphabetically in ascending or descending order.
```
| Classes    | Methods              | Scenario                       | Outputs      |
|------------|----------------------|--------------------------------|--------------|
| `ToDoList` | `organizeTasksAsc()` | If there are tasks in the list | List<String> |
|            |                      | If there are no tasks          | null         |

| Classes    | Methods               | Scenario                       | Outputs      |
|------------|-----------------------|--------------------------------|--------------|
| `ToDoList` | `organizeTasksDesc()` | If there are tasks in the list | List<String> |
|            |                       | If there are no tasks          | null         |



> **Time to analyse**
>

## Learning Objectives
- Use user stories to create a domain model
- Use the Red Green Refactor approach to create source code from tests

## Set up instructions
- Fork this repository and clone the forked version to your machine
- Open the root directory of the project in IntelliJ

## Exercise Instructions

It may be beneficial to work in groups during the design phase of this exercise.

1. Create domain models based on the requirements outlined below. It's recommended that you put a good effort into this step, it'll make the next steps much easier.
2. Add your domain model to either a file named `domain-model.md` or as a screenshot.
3. There is an empty class named `TodoList` in `./src/main/java/com.booleanuk/core/`, you should write your source code in here
4. There is an almost empty test class for the `TodoList` class in `./src/test/java/com.booleanuk/core`, you should write your tests in here. There is an example test to help you with the format, use the tests in previous exercises to help guide you in using the `Assertions` class
5. For each requirement below, use the Red Green Refactor approach to create a single test and then make it pass by writing source code. It's important to practice writing the test first, don't rob yourself of learning this vital skill.

## Core Requirements

- I want to add tasks to my todo list.
- I want to see all the tasks in my todo list.
- I want to change the status of a task between incomplete and complete.
- I want to be able to get only the complete tasks.
- I want to be able to get only the incomplete tasks.
- I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- I want to remove tasks from my list.
- I want to see all the tasks in my list ordered alphabetically in ascending order.
- I want to see all the tasks in my list ordered alphabetically in descending order.

## Extension Requirements

Work on these only after you have completed the core requirements. You may need to make changes to your domain model to complete these.

Create new classes and tests for these requirements in the `./src/main/java/com.booleanuk/extension/` and `.src/test/java/com.booleanuk/extension/` directories respectively. **Do not continue working in the same classes you used during the core requirements above.**

You will see a `.gitkeep` file in each of those directories, you can safely ignore them. They're just there to make sure the directories are pushed to the repository when they're empty.

- I want to be able to get a task by a unique ID.
- I want to update the name of a task by providing its ID and a new name.
- I want to be able to change the status of a task by providing its ID.
- I want to be able to see the date and time that I created each task.

## Test Output

When you run a test, it's either going to pass or fail. When it fails, you'll be presented with a big red stream of text. This is called a stack trace and, though intimidating, does contain some useful information.

One of the core skills of a developer is debugging stack traces like this. The stack trace details in which classes & files the failure happened, and gives you a line number at the end. Most of the lines in the stack trace are irrelevant most of the time, you want to try and identify the files that you're actually working with.

In the sample screenshot below, we've tried to complete the first step of the exercise but provided an invalid value. Then we run the test associated with it and we see a big red stack trace, a test failure.

At the top, we see `expected: <32> but was: <33>`. This means the test expected the value to be 32, but the value the student provided was 33. We can see this in the code snippets at the top of the screenshot.

In the stack trace itself, we see this line: `at app//com.booleanuk.core.TodoListTest.shouldBeAged32(ExerciseTest.java:20)`. This is helpful! This tells us the exact line in the ExerciseTest.java file (line 20) where the failure happened, as well as the method name (shouldBeAged32), helping us to identify where the issue began. This is the kind of thing you need to look for; a relevant file name, method name, class name and line number to give you a good starting point for debugging.

![](./assets/test-failure.PNG)
