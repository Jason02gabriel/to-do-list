
# TO DO LIST API
## API for task list

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring**


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Jason02gabriel/to-do-list.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**API TO-DO-LIST**
```markdown
POST /tasks - Create a new task
GET /tasks - Retrieve all tasks
GET /tasks/name/name? - Retrieve a task by name
GET /tasks/{id} - Retrieve a task by id
PUT /tasks/{id} - Update a task
DELETE /clients/{id} - Delete a task by id
```

**BODY**
```json
{
  "name": "Alignment meeting",
  "description": "Alignment meeting with the manager at 10:00 am",
  "status": "COMPLETED" or "PROGRESS" or "UNREALIZED",
  "priority": "BAIXA" or "MEDIA" or "ALTA"
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.





