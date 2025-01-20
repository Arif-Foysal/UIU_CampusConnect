## Setup and Contribution Guidelines

### How to Setup this Project on Your Computer

#### Step 01: Forking
1. Log in to your GitHub account.
2. Fork this repository to your account (ensure both `main` and `development` branches are included).
3. Star this repository (optional but appreciated).

#### Step 02: Cloning
1. Open your terminal or Git Bash.
2. Clone the forked repository to your local machine:
   ```bash
   git clone <YOUR_FORKED_REPO_URL>
   ```
3. Navigate to the cloned directory:
   ```bash
   cd <REPO_DIRECTORY_NAME>
   ```
4. Add the original repository as the upstream remote to keep your fork updated:
   ```bash
   git remote add upstream <ORIGINAL_REPO_URL>
   ```

#### Step 03: Installing Dependencies

##### 1. MySQL Connector
You can follow this youtube video to install MySQL Connector.
<iframe width="560" height="315" src="https://www.youtube.com/embed/8aTpDfsYTNQ?si=zM0o0_rSLDyRtYjD" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

- Download the MySQL Connector for Java from the [official MySQL website]([https://dev.mysql.com/downloads/connector/j/](https://dev.mysql.com/downloads/connector/j/)).

- Add the `.jar` file to your project library:
  - If using an IDE like IntelliJ IDEA or Eclipse, right-click on the project, go to **Libraries**, and add the `.jar` file.

##### 2. JFoenix Library
- Download the JFoenix library from [JFoenix9.0.10.jar](https://search.maven.org/remotecontent?filepath=com/jfoenix/jfoenix/9.0.10/jfoenix-9.0.10.jar).
- Add the `.jar` file to your project library as done with the MySQL Connector.

#### Step 04: Setting Up the Database
1. Open phpMyAdmin on your local server.
2. Click on **Import** in the phpMyAdmin interface.
3. Select the `database.sql` file located in the root directory of the project.
4. Click **Go** to execute the SQL script and create the necessary database and tables.

### Contribution Guidelines

#### Step 01: Creating a Branch
1. Switch to the `development` branch:
   ```bash
   git checkout development
   ```
2. Pull the latest changes from the `development` branch:
   ```bash
   git pull upstream development
   ```
3. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b <YOUR_BRANCH_NAME>
   ```
   **Branch Naming Convention:** Use meaningful names like `feature-student-directory`, `fix-announcements-bug`, etc.

#### Step 02: Making Changes
1. Implement your changes.
2. Test your changes locally.
3. Add and commit your changes:
   ```bash
   git add .
   git commit -m "<YOUR_COMMIT_MESSAGE>"
   ```
   **Commit Message Guidelines:** Use concise and descriptive messages like `Added search functionality to Student Directory`.

#### Step 03: Pushing Changes
1. Push your changes to your branch:
   ```bash
   git push origin <YOUR_BRANCH_NAME>
   ```

#### Step 04: Creating a Pull Request
1. Go to your forked repository on GitHub.
2. Open the `Pull Requests` tab and click **New Pull Request**.
3. Compare your branch with the `development` branch of the original repository.
4. Add a descriptive title and comment about your changes.
5. Submit the pull request for review.

### Keeping Your Fork Updated
1. Fetch the latest changes from the upstream repository:
   ```bash
   git fetch upstream
   ```
2. Merge the changes into your local `development` branch:
   ```bash
   git checkout development
   git merge upstream/development
   ```
3. Push the updates to your fork:
   ```bash
   git push origin development
   ```

### Notes for Contributors
- Always create a branch for your contributions; never commit directly to the `main` or `development` branches.
- Ensure your code follows the project's coding style and conventions.
- Write clear and concise commit messages.
- Test your changes thoroughly before creating a pull request.

Happy contributing! 🚀
