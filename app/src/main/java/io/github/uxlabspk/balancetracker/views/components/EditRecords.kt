package io.github.uxlabspk.balancetracker.views.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.uxlabspk.balancetracker.ui.theme.BorderColor
import io.github.uxlabspk.balancetracker.ui.theme.ThemeColors.Day.bgColor
import io.github.uxlabspk.balancetracker.ui.theme.YellowColor

@Composable
fun EditRecords() {
    var username by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }
    var selectedOption by remember { mutableStateOf("Select Option") }
    var isDropdownExpanded by remember { mutableStateOf(false) }
    var isCurrencyMenuExpanded by remember { mutableStateOf(false) }

    var isNameError by remember { mutableStateOf(false) }

    Column(
        Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp)
    ) {
        TextFieldWithLabel(
            value = username,
            onValueChange = {
                username = it
                isNameError = it.isBlank()
            },
            label = "Enter your name...",
            isError = isNameError,
            leadingIcon = Icons.Default.AccountBox
        )

        Spacer(modifier = Modifier.height(16.dp))

        DropdownMenuWithLabel(
            selectedOption = selectedOption,
            onOptionSelected = { selectedOption = it },
            isExpanded = isDropdownExpanded,
            onDismiss = { isDropdownExpanded = false },
            options = listOf("Buy", "Sell")
        ) { isDropdownExpanded = true }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            DropdownIconButton(
                isExpanded = isCurrencyMenuExpanded,
                onClick = { isCurrencyMenuExpanded = true },
                onDismiss = { isCurrencyMenuExpanded = false },
                options = listOf("USD", "EUR")
            )

            Spacer(modifier = Modifier.width(16.dp))

            TextFieldWithLabel(
                value = amount,
                onValueChange = { amount = it },
                label = "Amount",
                keyboardType = KeyboardType.Number
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier.padding(bottom = 10.dp).align(Alignment.End),
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = YellowColor
            ),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, BorderColor),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 2.dp
            )
        ) {
            Image(Icons.Default.Add, contentDescription = null, colorFilter = ColorFilter.tint(bgColor), modifier = Modifier.padding(end = 5.dp).width(20.dp))
        }


        PrimaryButton(
            text = "Sign up",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
                .height(46.dp)
        ) {}
    }
}

@Composable
fun TextFieldWithLabel(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isError: Boolean = false,
    leadingIcon: ImageVector? = null,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label, color = MaterialTheme.colorScheme.onPrimary) },
        isError = isError,
        leadingIcon = leadingIcon?.let {
            { Icon(imageVector = it, contentDescription = null) }
        },
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedLabelColor = Color.DarkGray,
            focusedLabelColor = Color.DarkGray,
            focusedLeadingIconColor = MaterialTheme.colorScheme.onPrimary,
            unfocusedLeadingIconColor = MaterialTheme.colorScheme.onPrimary,
            focusedTextColor = MaterialTheme.colorScheme.onPrimary,
            unfocusedTextColor = MaterialTheme.colorScheme.onPrimary,
            disabledIndicatorColor = Color.Transparent,
            focusedContainerColor = MaterialTheme.colorScheme.surface,
            unfocusedContainerColor = MaterialTheme.colorScheme.surface,
            cursorColor = MaterialTheme.colorScheme.onPrimary
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = keyboardType,
            imeAction = ImeAction.Next
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(5.dp),
        singleLine = true
    )
}

@Composable
fun DropdownMenuWithLabel(
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
    isExpanded: Boolean,
    onDismiss: () -> Unit,
    options: List<String>,
    onExpand: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Button(
            onClick = onExpand,
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, BorderColor),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = selectedOption, color = Color.Black)
        }
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = onDismiss,
            modifier = Modifier.background(MaterialTheme.colorScheme.surface)
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = {
                        onOptionSelected(option)
                        onDismiss()
                    }
                )
            }
        }
    }
}

@Composable
fun DropdownIconButton(
    isExpanded: Boolean,
    onClick: () -> Unit,
    onDismiss: () -> Unit,
    options: List<String>
) {
    Box {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, BorderColor),
            shape = RoundedCornerShape(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                tint = Color.Black
            )
        }
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = onDismiss,
            modifier = Modifier.background(MaterialTheme.colorScheme.surface)
        ) {
            options.forEach { option ->
                DropdownMenuItem(
                    text = { Text(option) },
                    onClick = { onDismiss() }
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewEditRecords() {
    EditRecords()
}
